/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.mavenproject1;


import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author apprentice
 */
@Controller
public class UnitServlet {

    @RequestMapping(value = "/unitIndex", method = RequestMethod.GET)
    public String displayThatShiz() {
        return "unitIndex";
    }

    @RequestMapping(value = "/convert", method = RequestMethod.POST)
    public String doThePost(HttpServletRequest request) {

        boolean badInput = false;
        int x;
        int d1;
        int d2;
        int v1;
        int v2;
        int m1;
        int m2;
        double amount;

        try {
            x = Integer.parseInt(request.getParameter("measurements"));
            d1 = Integer.parseInt(request.getParameter("dUnit1"));
            d2 = Integer.parseInt(request.getParameter("dUnit2"));
            v1 = Integer.parseInt(request.getParameter("vUnit1"));
            v2 = Integer.parseInt(request.getParameter("vUnit2"));
            m1 = Integer.parseInt(request.getParameter("mUnit1"));
            m2 = Integer.parseInt(request.getParameter("mUnit2"));
            amount = Double.parseDouble(request.getParameter("amount"));

            switch (x) {
                case 1:
                    if (d1 == 1) {

                        if (d2 == 2) {
                            amount = amount / 12;
                        } else if (d2 == 3) {
                            amount = amount / 36;
                        } else if (d2 == 4) {
                            amount = amount / 63360;
                        }

                    } else if (d1 == 2) {
                        amount = amount * 12;

                        if (d2 == 2) {
                            amount = amount / 12;
                        } else if (d2 == 3) {
                            amount = amount / 36;
                        } else if (d2 == 4) {
                            amount = amount / 63360;
                        }

                    } else if (d1 == 3) {
                        amount = amount * 36;

                        if (d2 == 2) {
                            amount = amount / 12;
                        } else if (d2 == 3) {
                            amount = amount / 36;
                        } else if (d2 == 4) {
                            amount = amount / 63360;
                        }

                    } else if (d1 == 4) {
                        amount = amount * 63360;

                        if (d2 == 2) {
                            amount = amount / 12;
                        } else if (d2 == 3) {
                            amount = amount / 36;
                        } else if (d2 == 4) {
                            amount = amount / 63360;
                        }

                    }

                case 2:
                    if (v1 == 1) {

                        if (v2 == 2) {
                            amount = amount / 2;
                        } else if (v2 == 3) {
                            amount = amount / 4;
                        } else if (v2 == 4) {
                            amount = amount / 16;
                        }

                    } else if (v1 == 2) {
                        amount = amount * 2;

                        if (v2 == 2) {
                            amount = amount / 2;
                        } else if (v2 == 3) {
                            amount = amount / 4;
                        } else if (v2 == 4) {
                            amount = amount / 16;
                        }

                    } else if (v1 == 3) {
                        amount = amount * 4;

                        if (v2 == 2) {
                            amount = amount / 2;
                        } else if (v2 == 3) {
                            amount = amount / 4;
                        } else if (v2 == 4) {
                            amount = amount / 16;
                        }

                    } else if (v1 == 4) {
                        amount = amount * 16;

                        if (v2 == 2) {
                            amount = amount / 2;
                        } else if (v2 == 3) {
                            amount = amount / 4;
                        } else if (v2 == 4) {
                            amount = amount / 16;
                        }

                    }

                case 3:
                    if (m1 == 1) {

                        if (m2 == 2) {
                            amount = amount / 28.35;
                        } else if (m2 == 3) {
                            amount = amount / 454;
                        } else if (m2 == 4) {
                            amount = amount / 907184;
                        }

                    } else if (m1 == 2) {
                        amount = amount * 28.35;

                        if (m2 == 2) {
                            amount = amount / 28.35;
                        } else if (m2 == 3) {
                            amount = amount / 454;
                        } else if (m2 == 4) {
                            amount = amount / 907184;
                        }

                    } else if (m1 == 3) {
                        amount = amount * 454;

                        if (m2 == 2) {
                            amount = amount / 28.35;
                        } else if (m2 == 3) {
                            amount = amount / 454;
                        } else if (m2 == 4) {
                            amount = amount / 907184;
                        }

                    } else if (m1 == 4) {
                        amount = amount * 907184;

                        if (m2 == 2) {
                            amount = amount / 28.35;
                        } else if (m2 == 3) {
                            amount = amount / 454;
                        } else if (m2 == 4) {
                            amount = amount / 907184;
                        }

                    }
            }

            request.setAttribute("amount", amount);

        } catch (NumberFormatException nfe) {
            badInput = true;
            request.setAttribute("badInput", badInput);
        }

        return "UnitConverterResponse";
    }

}
