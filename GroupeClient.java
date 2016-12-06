import java.util.Set;
import java.util.HashSet;

public class GroupeClient implements IVisitable {
   private String/*No type specified!*/ name;
   
   private void setName(String/*No type specified!*/ value) {
      this.name = value;
   }
   
   private String/*No type specified!*/ getName() {
      return this.name;
   }
   
   /**
    * <pre>
    *           1..1     0..*
    * GroupeClient ------------------------- Client
    *           groupeClient        &gt;       clients
    * </pre>
    */
   private Set<Client> clients;
   
   public Set<Client> getClients() {
      if (this.clients == null) {
         this.clients = new HashSet<Client>();
      }
      return this.clients;
   }
   
   public void accept(IVisitor visitor) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   /*public String getName() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }*/
   
   public void addClient(Client c) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public GroupeClient (String name) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   }
