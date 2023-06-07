package shorterUrlService.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "url")
public class UrlEntity {
    @Id
    @SequenceGenerator(name = "url_id_gen", sequenceName = "url_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "url_id_gen")
    private Long id;
    private String longUrl;
    private String shortUrl;

    public UrlEntity() {}

    public UrlEntity(String longUrl, String shortUrl) {
        this.longUrl = longUrl;
        this.shortUrl = shortUrl;
    }

    public Long getId() {
        return id;
    }

    public String getLongUrl() {
        return longUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }
}