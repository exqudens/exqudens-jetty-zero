package exqudens.jetty.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import exqudens.jetty.request.ExampleRequest;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

public class Test1 {

    @Test
    public void test1() {
        try {
            ExampleRequest request = new ExampleRequest();
            request.setIds(new HashSet<>(Arrays.asList(101L, 103L, 103L)));
            System.out.println(new ObjectMapper().writeValueAsString(request));
        } catch (RuntimeException e) {
            //
        } catch (Throwable t) {
            //
        }
    }

}
