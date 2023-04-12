package twogtwoj.whereishere.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import twogtwoj.whereishere.domain.EventPost;
import twogtwoj.whereishere.repository.EventPostRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventPostService {
    private final EventPostRepository eventPostRepository;

    @Transactional
    public void saveEventPost(EventPost eventPost){
        eventPostRepository.save(eventPost);
    }

    public List<EventPost> findEventPost() {
        return eventPostRepository.findAll();
    }

    public EventPost findOne(Long eventPostId) {
        return eventPostRepository.findOne(eventPostId);
    }
}
