package xdx.note.mdm.mapper;

import org.apache.ibatis.annotations.Param;
import xdx.note.mdm.domain.po.AddressPo;

public interface AddressMapper {

    AddressPo getById(@Param("id") Long id);



}
