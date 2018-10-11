package nyc.codyboppert.calculatorServer.resources;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import nyc.codyboppert.calculatorServer.views.CalculatorView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.TEXT_HTML)
public class CalculatorResource {
    private float a = 0;
    private float b = 0;
    private float c = 0;
    private float d = 1;

    public CalculatorResource() {
    }

    @GET
    @Timed
    public CalculatorView calculate(@QueryParam("a") Optional<Float> e,
                                    @QueryParam("b") Optional<Float> f,
                                    @QueryParam("c") Optional<Float> g,
                                    @QueryParam("d") Optional<Float> h) {
        a = e.or(a);
        b = f.or(b);
        c = g.or(c);
        d = h.or(d);
        return new CalculatorView(a, b, c, d, ((a + b) * c)/d);
    }
}
