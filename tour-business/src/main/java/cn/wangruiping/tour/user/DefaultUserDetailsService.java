//package cn.wangruiping.tour.user;
//
//import cn.wangruiping.tour.db.entity.UserEntity;
//import cn.wangruiping.tour.db.service.UserService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
///**
// *
// * @author wrp
// * @since 2026年03月12日 10:03
// **/
//@Component
//@RequiredArgsConstructor
//public class DefaultUserDetailsService implements UserDetailsService {
//
//    private final UserService userService;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//        UserEntity user = userService.getByUsername(username);
//        if(user == null) {
//            throw new UserException("用户名不存在");
//        }
//
//        return new MyUserDetails(user);
//    }
//}
