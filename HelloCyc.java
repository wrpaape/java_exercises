import org.opencyc.cycobject.CycList; 
import org.opencyc.cycobject.CycObject; 
import org.opencyc.cycobject.CycConstant; 
import org.opencyc.cycobject.DefaultCycObject; 
import org.opencyc.api.CycAccess;

public static final void helloWorlds() { 
  CycAccess access = null; 
  try { 
    access = new CycAccess("localhost", 3600); // @note: use actual server and port 
    CycConstant planetInSolarSystem = (CycConstant) 
    DefaultCycObject.fromCompactExternalId("Mx4rWIie-jN6EduAAADggVbxzQ", access); 
    CycList planets = access.getAllInstances(planetInSolarSystem); 

    for (Object planet : planets) { 
      System.out.println("Hello '" + 
        access.getImpreciseSingularGeneratedPhrase((CycObject)planet) + "'."); 
    } 
  } catch (Exception e) {
    e.printStackTrace();
  } finally {
    if (access != null) {
      access.close();
    }
  } 
}
