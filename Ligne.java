
public class Ligne implements IVisitable {
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
    * Ligne ------------------------- Commande
    *           lignes        &lt;       commande
    * </pre>
    */
   private Commande commande;
   
   public void setCommande(Commande value) {
      this.commande = value;
   }
   
   public Commande getCommande() {
      return this.commande;
   }
   
   public void accept(IVisitor visitor) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
  /* public String getName() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }*/
   
   public Ligne (String name) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   }
