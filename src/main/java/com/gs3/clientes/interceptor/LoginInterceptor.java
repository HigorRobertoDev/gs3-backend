package com.gs3.clientes.interceptor;

import com.gs3.clientes.service.impl.HistoricoService;
import com.gs3.clientes.service.impl.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Autowired
    private HistoricoService historicoService;

    @Autowired
    private UsuarioService usuarioService;


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
//        try {
//            if (handler instanceof HandlerMethod) {
//                HandlerMethod handlerMethod = (HandlerMethod) handler;
//                if(handlerMethod.getMethod().getName().equals("login")) {
//                    String login = request.getParameter("user");
//                    String senha = request.getParameter("pass");
//                    historicoService.gravaHistorico(login, TipoTransacaoEnum.LOGIN);
//                    usuarioService.getByUserPass(login, senha);
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {


    }
}
