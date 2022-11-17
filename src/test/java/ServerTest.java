import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ServerTest {

    Server server; Guest guest1,guest2;

    @BeforeEach
    public void setUp(){
        server = new Server();
        guest1 = new Guest("Simba", 14, 500, 0);
        guest2 = new Guest("Jimmy Kimmel", 34, 400, 40 );
        drinkNames =
    }

    // TODO: test that guest can only get served if over 18

    @Test
    public void canServeGuest(){
        assertThat(server.canServeGuest(guest1)).isEqualTo(true);
    }
    @Test
    public void cannotServeGuest(){
        server.canServeGuest(guest2);
        assertThat(server.canServeGuest(guest2)).isEqualTo(true);
    }

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)

    @Test
    public void canServeGuestWithEnoughMoney (){
        server.serve(guest2){
            assertThat(server.cannotServeGuest(guest2)).isEqualTo(false);
        }
    }


    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)


    // TODO: test that guest can only get served if guest is not banned from the pub


    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)


    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink

    //  (give server a list of drinks (strings) it can make)

}