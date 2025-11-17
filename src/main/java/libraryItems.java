public abstract class libraryItems {
    private String title;
    private String author;
    private String serialNumber;
    protected boolean isBorrowed;

    public libraryItems(String title, String author, String serialNumber, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.serialNumber = serialNumber;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public abstract boolean isBorrowed(User user);
}
