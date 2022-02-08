package cotcox.domain.conductores;

import java.util.List;

public class PoolConductores {
    private List<Conductor> poolConductores;

    public PoolConductores(List<Conductor> conductores) {
        this.poolConductores = conductores;
    }

    public List<Conductor> getPoolConductores() {
        return this.poolConductores;
    }


}
