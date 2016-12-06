import java.util.Set;
import java.util.HashSet;

public class Client implements IVisitable {
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
    * Client ------------------------- Commande
    *           client        &gt;       commandes
    * </pre>
    */
   private Set<Commande> commandes;
   
   public Set<Commande> getCommandes() {
      if (this.commandes == null) {
         this.commandes = new HashSet<Commande>();
      }
      return this.commandes;
   }
   
   /**
    * <pre>
    *           0..*     1..1
    * Client ------------------------- GroupeClient
    *           clients        &lt;       groupeClient
    * </pre>
    */
   private GroupeClient groupeClient;
   
   public void setGroupeClient(GroupeClient value) {
      this.groupeClient = value;
   }
   
   public GroupeClient getGroupeClient() {
      return this.groupeClient;
   }
   
   public void accept(IVisitor visitor) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
  /* public String getName() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }*/
   
   public void addCommande(Commande c) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   }
