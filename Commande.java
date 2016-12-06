import java.util.Set;
import java.util.HashSet;

public class Commande implements IVisitable {
   private String name;
   
   private void setName(String value) {
      this.name = value;
   }
   
   private String getName() {
      return this.name;
   }
   
   /**
    * <pre>
    *           0..*     1..1
    * Commande ------------------------- Client
    *           commandes        &lt;       client
    * </pre>
    */
   private Client client;
   
   public void setClient(Client value) {
      this.client = value;
   }
   
   public Client getClient() {
      return this.client;
   }
   
   /**
    * <pre>
    *           1..1     0..*
    * Commande ------------------------- Ligne
    *           commande        &gt;       lignes
    * </pre>
    */
   private Set<Ligne> lignes;
   
   public Set<Ligne> getLignes() {
      if (this.lignes == null) {
         this.lignes = new HashSet<Ligne>();
      }
      return this.lignes;
   }
   
   public void accept(IVisitor visitor) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   /*
   public String getName() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }*/
   
   public void addLigne(Ligne l) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public Commande (String name) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public Commande (String name, String ligneName) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   }
