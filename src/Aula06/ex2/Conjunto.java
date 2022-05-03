package Aula06.ex2;

public class Conjunto {
    private int[] vector = new int[0];

    public boolean contains(int n) {
        for (int i = 0; i < this.size(); i++) {
            if (this.vector[i] == n) {
                return true;
            }
        }
        return false;

    }

    public void empty() {
        this.vector = new int[0];
    }

    public int size() {
        return this.vector.length;
    }

    public void insert(int n) {
        if (!this.contains(n)) {
            int[] aux = new int[this.size() + 1];
            for (int i = 0; i < this.size(); i++) {
                aux[i] = this.vector[i];
            }
            aux[aux.length - 1] = n;
            this.vector = aux;
        }

    }
    public void remove(int n) {
        if (this.contains(n)) {
            int[] aux = new int[this.size() - 1];
            int j = 0;
            for (int i = 0; i < this.size(); i++) {
                if (this.vector[i] != n) {
                    aux[j] = this.vector[i];
                    j++;
                }
            }
            this.vector = aux;
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.size(); i++) {
            s += this.vector[i] + " ";
        }
        return s;
    }

    public Conjunto combine(Conjunto x) {
        Conjunto res = new Conjunto();
        for (int i = 0; i < this.size(); i++) {
            res.insert(this.vector[i]);
        }
        for (int i = 0; i < x.size(); i++) {
            res.insert(x.vector[i]);
        }
        return res;
    }

    public Conjunto subtract(Conjunto y) {
        Conjunto res = new Conjunto();
        for (int i = 0; i < this.size(); i++) {
            res.insert(this.vector[i]);
        }
        for (int i = 0; i < y.size(); i++) {
            res.remove(y.vector[i]);
        }
        return res;
    }

    public Conjunto intersect(Conjunto z) {
        Conjunto res = new Conjunto();
        for (int i = 0; i < this.size(); i++) {
            if (z.contains(this.vector[i])) {
                res.insert(this.vector[i]);
            }
        }
        return res;
    }
}
