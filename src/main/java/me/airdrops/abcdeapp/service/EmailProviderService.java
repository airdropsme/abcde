package me.airdrops.abcdeapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmailProviderService {

    private final Logger log = LoggerFactory.getLogger(EmailProviderService.class);

}
