package srp.art.gallery.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import srp.art.gallery.model.User;

import java.util.LinkedHashMap;
import java.util.Map;

@Repository
public class UserRepository {

    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

    public void insert(User user){
        String inertSql = "INSERT INTO USER (id, first_name, last_name, email_id, created_date )" +
                " VALUES ( :id, :first_name, :last_name, :email_id, :created_date )";
        Map<String, Object> paramMap = new LinkedHashMap<>();
        paramMap.put("id", user.getId());
        paramMap.put("first_name", user.getFirstName());
        paramMap.put("last_name", user.getLastName());
        paramMap.put("email_id", user.getEmailId());
        paramMap.put("created_date", user.getCreatedDate());
        jdbcTemplate.update(inertSql, paramMap);
    }
}
