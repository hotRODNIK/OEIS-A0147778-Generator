public class Pairs {
    private final long n;
    private final long fN;

    public Pairs(long l, long r){
        this.n = l;
        this.fN = r;
    }

    public long getN() {
        return n;
    }

    public long getfN() {
        return fN;
    }

    @Override
    public String toString() {
        return "n = " + this.n + ", f(n) = " + this.fN;
    }
}
