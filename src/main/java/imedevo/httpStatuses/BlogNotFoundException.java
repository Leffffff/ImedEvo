package imedevo.httpStatuses;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "This blog isn't found in DataBase")
public class BlogNotFoundException extends Exception {
}
