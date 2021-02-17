package xdx.note.mdm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xdx.note.mdm.domain.po.AddressPo;
import xdx.note.mdm.mapper.AddressMapper;
import xdx.note.mdm.service.AddressService;


@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;


    @Override
    public AddressPo getAddress(Long id) {
        return addressMapper.getById(id);
    }


}
