import com.cyc.kb.ContextFactory;
import com.cyc.kb.KbCollection;
import com.cyc.kb.KbCollectionFactory;
import com.cyc.kb.KbIndividual;
import com.cyc.kb.exception.CreateException;
import com.cyc.kb.exception.KbTypeException;
import com.cyc.session.CycSessionManager;
import com.cyc.session.exception.SessionException;
//import com.sun.xml.internal.bind.v2.ContextFactory;
import java.util.Set;
 
public class HelloWorlds {
    //Author: Michael Witbrock. 
    //Licence: CC0
    public static  void main(String[] argv){
 
        try {
            CycSessionManager.getCurrentSession().getOptions().setDefaultContext(
            ContextFactory.getDefaultContext(ContextFactory.UV_MT, ContextFactory.INFERENCE_PSC));
               
            //KbCollection planetInSolarSystem = KbCollectionFactory.get("Mx4rWIie-jN6EduAAADggVbxzQ");
            KbCollection planetInTheSolarSystem = KbCollectionFactory.get("PlanetInTheSolarSystem");
            Set<KbIndividual> planets = (Set<KbIndividual>) planetInTheSolarSystem.getInstances();
            for (KbIndividual planet : planets) {
                System.out.println("Hello '"
                        + planet.toString() + "'.");
            }
        } catch (KbTypeException | CreateException | SessionException e) {
            System.out.println("A problem occured in finding the solar system:" + e);
        }
    }
}