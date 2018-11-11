package Program;
import java.util.Comparator;
public class NIM implements Comparator<Mahasiswa> {
    @Override
    public int compare(Mahasiswa x, Mahasiswa y)
    {
        return x.getnim().compareToIgnoreCase(y.getnim());
    }
}