import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketRepositoryTest {

    @Test
    public void testFindAllTickets() {
        TicketRepository repo = new TicketRepository();

        Ticket ticket1 = new Ticket(1, "MSK", "SPB", 200, 93);
        Ticket ticket2 = new Ticket(2, "MSK", "SPB", 100, 98);
        Ticket ticket3 = new Ticket(3, "MSK", "UFA", 200, 186);
        Ticket ticket4 = new Ticket(4, "MSK", "SPB", 400, 122);
        Ticket ticket5 = new Ticket(5, "UFA", "SPB", 800, 222);
        Ticket ticket6 = new Ticket(6, "MSK", "SPB", 200, 130);
        Ticket ticket7 = new Ticket(7, "NEW", "LA",  300, 243);
        Ticket ticket8 = new Ticket(8, "MSK", "SPB", 500, 99);
        repo.add(ticket1);
        repo.add(ticket2);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket5);
        repo.add(ticket6);
        repo.add(ticket7);
        repo.add(ticket8);

        Ticket[] expected = {ticket1,ticket2, ticket3, ticket4, ticket5, ticket6, ticket7, ticket8};
        Ticket[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddSomeTickets() {
        TicketRepository repo = new TicketRepository();

        Ticket ticket1 = new Ticket(1, "MSK", "SPB", 200, 93);
        Ticket ticket2 = new Ticket(2, "MSK", "SPB", 100, 98);
        Ticket ticket3 = new Ticket(3, "MSK", "UFA", 200, 186);
        Ticket ticket4 = new Ticket(4, "MSK", "SPB", 400, 122);
        Ticket ticket5 = new Ticket(5, "UFA", "SPB", 800, 222);
        Ticket ticket6 = new Ticket(6, "MSK", "SPB", 200, 130);
        Ticket ticket7 = new Ticket(7, "NEW", "LA",  300, 243);
        Ticket ticket8 = new Ticket(8, "MSK", "SPB", 500, 99);

        repo.add(ticket5);
        repo.add(ticket6);
        repo.add(ticket7);
        repo.add(ticket8);

        Ticket[] expected = {ticket5, ticket6, ticket7, ticket8};
        Ticket[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testDeleteTickets() {
        TicketRepository repo = new TicketRepository();

        Ticket ticket1 = new Ticket(1, "MSK", "SPB", 200, 93);
        Ticket ticket2 = new Ticket(2, "MSK", "SPB", 100, 98);
        Ticket ticket3 = new Ticket(3, "MSK", "UFA", 200, 186);
        Ticket ticket4 = new Ticket(4, "MSK", "SPB", 400, 122);
        Ticket ticket5 = new Ticket(5, "UFA", "SPB", 800, 222);
        Ticket ticket6 = new Ticket(6, "MSK", "SPB", 200, 130);
        Ticket ticket7 = new Ticket(7, "NEW", "LA",  300, 243);
        Ticket ticket8 = new Ticket(8, "MSK", "SPB", 500, 99);
        repo.add(ticket1);
        repo.add(ticket2);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket5);
        repo.add(ticket6);
        repo.add(ticket7);
        repo.add(ticket8);

        Ticket[] expected = {ticket1,ticket2, ticket3, ticket4, ticket5, ticket6, ticket7, ticket8};
        Ticket[] actual = repo.deleteById(5);

        Assertions.assertArrayEquals(expected, actual);
    }

}