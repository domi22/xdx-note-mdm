package xdx.note.mdm.controller.intranet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xdx.note.framework.common.param.Info;
import xdx.note.framework.common.param.ResultUtil;
import xdx.note.mdm.exception.Code;
import xdx.note.mdm.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;


    @GetMapping("/id")
    public Info getAddress(@RequestParam("id")Long id) {
        return ResultUtil.success(Code.SUCCESS,addressService.getAddress(id));
    }


}
