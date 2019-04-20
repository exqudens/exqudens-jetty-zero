package exqudens.jetty.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import exqudens.jetty.request.ExampleRequest;
import exqudens.jetty.response.ExampleResponse;
import org.eclipse.jetty.http.HttpStatus;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.stream.Collectors;

public class ExampleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String body = req.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
        ExampleRequest request = new ObjectMapper().readValue(body, ExampleRequest.class);
        ExampleResponse response = new ExampleResponse(request.toString());
        resp.setStatus(HttpStatus.OK_200);
        resp.getWriter().println(new ObjectMapper().writeValueAsString(response));
    }
}
