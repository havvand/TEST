import java.util.ArrayList;

public interface Negotiations
{
    void negotiationType();
    void acceptOffer();
    void declineOffer();
    void addClient(Player player, Clients client);
    void removeClient(Player player, Clients client);
}
