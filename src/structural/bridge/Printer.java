package structural.bridge;

import java.util.List;

public abstract class Printer {
    public String print(Formatter formatter) {
        return formatter.format(getHeaders(), getDetails());
    }

    protected abstract List<Detail> getDetails();

    protected abstract String getHeaders();
}
