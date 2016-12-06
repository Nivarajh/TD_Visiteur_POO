
public interface IVisitor {
   public void visit(Client c);
   
   public void visit(Commande o);
   
   public void visit(Ligne l);
   
   public void afficherCommandes();
   
   }
