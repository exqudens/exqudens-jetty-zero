package exqudens.jetty.response;

public class ExampleResponse {

    private String content;

    public ExampleResponse() {
    }

    public ExampleResponse(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ExampleResponse{");
        sb.append("content='").append(content).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
