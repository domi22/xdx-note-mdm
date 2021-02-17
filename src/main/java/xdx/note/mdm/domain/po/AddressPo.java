package xdx.note.mdm.domain.po;

import lombok.Data;
import xdx.note.framework.common.domain.BaseColumn;

@Data
public class AddressPo extends BaseColumn {

    private String countryCode;
    private String countryName;
    private String provinceCode;
    private String provinceName;
    private String cityCode;
    private String cityName;
    private String address;
    private String postcode;


}
