import java.util.Set;
import java.util.HashSet;

public class Main {
   /**
    * <pre>
    *           0..*     1..1
    * Main ------------------------> IVisitor
    *           main        &gt;       visiteur
    * </pre>
    */
   private IVisitor visiteur;
   
   public void setVisiteur(IVisitor value) {
      this.visiteur = value;
   }
   
   public IVisitor getVisiteur() {
      return this.visiteur;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * Main ------------------------> GroupeClient
    *           main        &gt;       groupeClient
    * </pre>
    */
   private Set<GroupeClient> groupeClient;
   
   public Set<GroupeClient> getGroupeClient() {
      if (this.groupeClient == null) {
         this.groupeClient = new HashSet<GroupeClient>();
      }
      return this.groupeClient;
   }
   
   public static void main(String[] args) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
      
      
      
   }
   
   }
