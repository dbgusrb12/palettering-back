package com.palettering.api.palettering.adapter;

import com.palettering.api.palettering.application.MemberQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor

@RestController
@RequestMapping("/api/v1/member")
public class MemberController {

    private final MemberQueryService memberQueryService;

}
