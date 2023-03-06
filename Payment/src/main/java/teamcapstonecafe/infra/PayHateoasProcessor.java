package teamcapstonecafe.infra;
import teamcapstonecafe.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class PayHateoasProcessor implements RepresentationModelProcessor<EntityModel<Pay>>  {

    @Override
    public EntityModel<Pay> process(EntityModel<Pay> model) {
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/payment").withRel("payment"));

        
        return model;
    }
    
}
