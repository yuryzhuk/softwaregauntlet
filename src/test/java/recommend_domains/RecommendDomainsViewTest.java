package recommend_domains;

import com.softwareonpurpose.gauntlet.GauntletTest;
import org.testng.annotations.Test;

@Test
public class RecommendDomainsViewTest extends GauntletTest{

    @Test
    public void Smoke(){
        RecommendDomainsViewExpected expected = RecommendDomainsViewExpected.getInstance();
        confirm(expected.validate(actual));
    }

}
