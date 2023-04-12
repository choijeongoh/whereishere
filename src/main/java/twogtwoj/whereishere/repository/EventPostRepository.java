package twogtwoj.whereishere.repository;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import twogtwoj.whereishere.domain.EventPost;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Transactional
@Repository
public class EventPostRepository {

    private final EntityManager em;

    public void save(EventPost eventPost) {
        if (eventPost.getEventPostId() == null) {
            em.persist(eventPost);
        } else {
            em.merge(eventPost);
        }
    }

    public EventPost findOne(Long id) {
        return em.find(EventPost.class, id);
    }

    public List<EventPost> findAll() {
        return em.createQuery("select i from EventPost i", EventPost.class)
                .getResultList();
    }
}
