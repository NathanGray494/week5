package ie.atu.lab_5;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "jsonplaceholder", url = "https://jsonplaceholder.typicode.com/")
public interface TodoClient
{
    @GetMapping("/todos/1")
    TodoResponse fetchData();

    @GetMapping("/todos")
    List<TodoResponse> fetchListData();
}
