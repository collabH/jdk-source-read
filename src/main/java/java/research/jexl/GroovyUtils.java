package dev.research.jexl;

import org.assertj.core.util.Sets;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class GroovyUtils {


    public static Set<String> getRiskSet(String riskCodes) {
        return StringUtils.isEmpty(riskCodes) ? Sets.newHashSet() : new HashSet(Arrays.asList(riskCodes.split(",")));
    }

}
