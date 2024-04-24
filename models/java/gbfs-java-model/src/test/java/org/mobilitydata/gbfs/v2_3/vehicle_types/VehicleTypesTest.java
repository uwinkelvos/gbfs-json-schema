package org.mobilitydata.gbfs.v2_3.vehicle_types;

import org.mobilitydata.gbfs.TestBase;
import org.mobilitydata.gbfs.v2_3.GBFSVehicleTypes;
import org.junit.jupiter.api.Test;

class VehicleTypesTest extends TestBase {
    @Test
    void testUnmarshal() {
        assertUnmarshalDoesNotThrow("v2_X/vehicle_types.json", GBFSVehicleTypes.class);
    }
}
