package exqudens.jetty.request;

import java.util.List;
import java.util.Set;

public class ExampleRequest {

    private Set<Long> ids;
    private List<String> names;

    public ExampleRequest() {
    }

    public ExampleRequest(Set<Long> ids, List<String> names) {
        this.ids = ids;
        this.names = names;
    }

    public Set<Long> getIds() {
        return ids;
    }

    public void setIds(Set<Long> ids) {
        this.ids = ids;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ExampleRequest{");
        sb.append("ids=").append(ids);
        sb.append(", names=").append(names);
        sb.append('}');
        return sb.toString();
    }

}
