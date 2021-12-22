package com.nioya.redshiftdemo.config;

import org.hibernate.dialect.PostgreSQL81Dialect;

public class RedShiftDialect extends PostgreSQL81Dialect {

    @Override
    public String getQuerySequencesString() {
        return "Select 1 as sequence_catalog,1 as sequence_schema,1 as sequence_name," +
                "1 as data_type,1 as numeric_precision,1 as numeric_precision_radix," +
                "1 as numeric_scale,1 as start_value,1 as minimum_value," +
                "1 as maximum_value,1 as increment,1 as cycle_option";
    }
}
