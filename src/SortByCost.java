import java.util.Comparator;

class SortByCost implements Comparator<WeightedFile> {
    public int compare(WeightedFile a, WeightedFile b) {
        if ( a._val < b._val ) return 1;
        else if ( a._val == b._val ) return 0;
        else return -1;
    }
}