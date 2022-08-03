package OOP1.bai1;

class PhanSo {
    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    private int tuSo, mauSo;

    private void rutGon () {
        int uocChungLonNhat = 1;
        for (int i = 1; i <= tuSo && i <= mauSo; i++) {
            if (tuSo % i == 0 && mauSo % i == 0) {
                uocChungLonNhat = i;
            }
        }
        tuSo = tuSo / uocChungLonNhat;
        mauSo = mauSo / uocChungLonNhat;
    }

    public void display() {
        rutGon();
        System.out.println(tuSo + "/" + mauSo);
    }
}
