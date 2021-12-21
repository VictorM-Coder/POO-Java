package agenda3;

import java.util.List;

public class ContactStar  extends Contact {
    private boolean star;

    //contrutor default
    public ContactStar(String name, List<Fone> fones, boolean star) {
        super(name, fones);
        this.star = star;
    }

    @Override
    public String toString(){
        return super.toString();
    }

    //muda o prefixo e o valor de star
    public void setStar(boolean value) {
        this.star = value;
        this.prefix = (value)? "@": "-";
    }

    public boolean getStar() {
        return this.star;
    }
}
