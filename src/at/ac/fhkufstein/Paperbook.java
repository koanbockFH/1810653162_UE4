package at.ac.fhkufstein;

import java.util.Date;

public class Paperbook extends Book
{
    private String series;
    private String month;

    public Paperbook(int pages, Date released, String title, String series)
    {
        super(pages, released, title, "000000-000000-0000");
        this.series = series;
        this.month = String.format("%tB", released);
    }

    public String getSeries()
    {
        return series;
    }

    public void setSeries(String series)
    {
        this.series = series;
    }

    public String getMonth()
    {
        return month;
    }

    public void setMonth(String month)
    {
        this.month = month;
    }
}
