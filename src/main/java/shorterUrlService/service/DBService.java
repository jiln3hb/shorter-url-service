package shorterUrlService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shorterUrlService.entity.UrlEntity;
import shorterUrlService.repository.UrlRepo;

import java.util.Optional;

@Service
public class DBService {
    private final UrlRepo urlRepo;

    @Autowired
    public DBService(UrlRepo urlRepo) {
        this.urlRepo = urlRepo;
    }

    public void save(UrlEntity urlEntity) {
        urlRepo.save(urlEntity);
    } //метод для сохранения сущности в бд

    public Optional<UrlEntity> findByshortUrl(String shortUrl) {
        return urlRepo.findByshortUrl(shortUrl);
    } //метод поиска информации о сущности по её shortUrl
}
