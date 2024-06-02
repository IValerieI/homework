package adapter;

public class MemoryCardAdapter implements IUsb {

    private final MemoryCard memoryCard;

    public MemoryCardAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }


    @Override
    public void connect() {
        memoryCard.connect();
    }
}
