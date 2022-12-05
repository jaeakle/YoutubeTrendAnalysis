import java.math.BigInteger;

public class Node 
{
    private String channelID;
    private String channelTitle;
    private String videoTitle;
    private String publishDate;
    private BigInteger views;
    private String videoID;
    private BigInteger likeCount;
    private BigInteger dislikeCount;

    public Node right = null;
    public Node left = null;
    public Node parent = null;

    boolean red = true;

    public String getChannelID() { return channelID; }
    public String getChannelTitle() { return channelTitle; }
    public String getVideoTitle() { return videoTitle; }
    public String getPublishDate() { return publishDate; }
    public BigInteger getViews() { return views; }
    public String getVideoID() { return videoID; }

    public void swapColor() { red = !red; }

    public void black() { red = false; }
    public void red() { red = true; }

    public Node(String channelID, String channelTitle, String videoTitle, String publishDate, BigInteger views, String videoID, BigInteger likeCount, BigInteger dislikeCount)
    {
        this.channelID = channelID;
        this.channelTitle = channelTitle;
        this.videoTitle = videoTitle;
        this.publishDate = publishDate;
        this.views = views;
        this.videoID = videoID;
        this.likeCount = likeCount;
        this.dislikeCount = dislikeCount;
    }
    
}