public class Time {
    private int ora;
    private int minuti;
    public Time(int newora, int newminuti){
        this.ora=newora;
        this.minuti= newminuti;
    }
    public int compareTo(Time other){
        if (this.ora< other.ora)
        {
            return -1;
        }
        else if(this.ora==other.ora)
        {
            if (this.minuti<other.minuti)
            {
                return -1;
            }
            else if (this.minuti==other.minuti)
            {
                return 0;
            }
            else
            {
                return 1;
            }
        }
        else
        {
            return 1;
        }

    }
}
