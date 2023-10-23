package ie.atu.lab_5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
public class FeignService
{
    private final TodoClient todoClient;
    private List<TodoResponse> todoList;

    public FeignService(TodoClient todoClient)
    {
        this.todoClient = todoClient;
        todoList = new ArrayList<>();
    }

    public TodoResponse fetchData()
    {
        TodoResponse td = todoClient.fetchData();
        System.out.println(td);

        try
        {
            Thread.sleep(2000);
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        return td;
    }

    public List<TodoResponse> fetchListData()
    {
        List<TodoResponse> td = todoClient.fetchListData();

        try
        {
            Thread.sleep(2000);
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        return td;
    }
}
