package backend.projeto_final.Controllers;

import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
    @GetMapping("/ajuda")
    public ResponseEntity<JSONObject> ajuda(){
        JSONObject obj = new JSONObject();
        obj.put("estudantes", "[Eliandra Cardoso, Maria Eduarda Monteiro, Suyane Bonfanti]");
        obj.put("projeto", "API para parcerias acadêmicas");
        obj.put("tema", "educação");
        return ResponseEntity.ok(obj);
    }
}
