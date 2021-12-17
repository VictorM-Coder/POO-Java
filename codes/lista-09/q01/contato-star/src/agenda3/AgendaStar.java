package agenda3;

import java.util.LinkedList;
import java.util.List;

public class AgendaStar extends Agenda {
    public AgendaStar(){
        super();
    }

    @Override
    public  String toString(){
        return super.toString();
    }
    //filtre em uma nova lista apenas os contatos que forem do tipo ContatoStar e que estão favoritados
    public List<Contact> getStarred(){
        List out = new LinkedList<Contact>();

        for (Contact contact: this.getContacts()){
            if (((ContactStar) contact).getStar()){
                out.add(contact);
            }
        }

        return out;
    }

    //SE o contato existir e for do tipo ContatoStar altere o atributo star dele
    public void star(String name, boolean value){
        Contact contact = this.findContact(name);

        if (contact instanceof ContactStar){
            ((ContactStar) contact).setStar(true);
        }
    }
}

