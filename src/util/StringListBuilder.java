package util;

import java.util.ArrayList;
import java.util.List;

public class StringListBuilder {

    List<String[]> list = null;

    public StringListBuilder() {
        list = new ArrayList<String[]>();
    }

    public StringListBuilder(List<String[]> list) {
        super();
        this.list = list;
    }

    public StringListBuilder addString(String... strs) {
        list.add(strs);
        return this;
    }

    public List<String[]> build() {
        return list;
    }

}
