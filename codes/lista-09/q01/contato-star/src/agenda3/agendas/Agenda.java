package agenda3.agendas;

import agenda3.contacts.Contact;
import agenda3.fones.Fone;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contact> contacts;

    public Agenda(){
        this.contacts = new ArrayList<Contact>();
    }

    public String toString(){
        String out = "";
        for (Contact contact: this.contacts){
            out += contact + "\n";
        }
        return out;
    }

    //retorna o objeto contato com esse nome ou null se não existir
    //utilize o método findPosByName
    public Contact findContact(String name){
        int indexContact = this.findPosByName(name);

        if (indexContact != -1){
            return this.contacts.get(indexContact);
        }else{
            System.out.println("fail: contato " + name + " nao existe");
        }

        return null;
    }

    //se nenhum contato existir com esse nome, adicione
    //se ja existir, faça o merge adicionando os telefones
    //por fim, ordene a lista para ficar em ordem alfabética
    public void addContact(Contact contact) {
        int contactIndex = this.findPosByName(contact.getName());

        if (contactIndex == -1){
            this.contacts.add(contact);
        }else{
            for (Fone fone: contact.getFones()){
                this.contacts.get(contactIndex).addFone(fone);
            }
        }

        // O código para a ordenação da lista já está feito logo abaixo
        // esta é a última linha de código da função
        this.contacts.sort((Contact c1, Contact c2) -> (c1.getName().compareTo(c2.getName())));
    }

    //Utilize o método findPosByName
    public void rmContact(String name){
        int contactIndex = this.findPosByName(name);

        if (contactIndex != -1){
            this.contacts.remove(contactIndex);
        }
    }

    //Monte uma lista auxiliar procurando no .toString() de cada contato
    //se ele possui a substring procurada.
    //dica: reveja os métodos da classe String e procure algum que ajude aqui
    public List<Contact> search(String pattern){
        List<Contact> auxList = new ArrayList<Contact>();

        for (Contact contact: this.contacts){
            if (contact.toString().contains(pattern)){
                auxList.add(contact);
            }
        }

        return auxList;
    }

    //retorna a posição do contato com esse nome no vetor ou -1 se não existir.
    private int findPosByName(String name){
        for (int cont = 0; cont < this.contacts.size(); cont++){
            if (name.equals(contacts.get(cont).getName())){
                return cont;
            }
        }

        return -1;
    }

    public List<Contact> getContacts(){
        return this.contacts;
    }
}
