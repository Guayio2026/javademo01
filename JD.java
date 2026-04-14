package demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class JD implements oc{
    private String name;
    private boolean status;
    public void press()
    {
        status=!status;
    }

}
